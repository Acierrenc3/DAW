document.addEventListener('DOMContentLoaded', function () {
    // Cargar recursos RSS al iniciar la aplicación
    loadRssList();

    // Manejar el evento de añadir RSS al hacer clic en el botón
    document.getElementById('crearRSS').addEventListener('click', function () {
        var title = prompt('Introduce el título del nuevo recurso RSS:');
        var url = prompt('Introduce la URL del recurso RSS:');

        if (title && url) {
            addRss(title, url);
        } else {
            alert('Debes proporcionar un título y una URL.');
        }
    });

    // Manejar el evento de cambiar el RSS seleccionado
    document.getElementById('campoSelect').addEventListener('change', function () {
        var selectedRss = this.value;
        showRssContent(selectedRss);
    });

    // Manejar el evento de eliminar RSS al hacer clic en el botón
    document.getElementById('borrarRSS').addEventListener('click', function () {
        var selectedRss = document.getElementById('campoSelect').value;
        deleteRss(selectedRss);
    });

    // Manejar el evento de navegar al RSS anterior
    document.getElementById('anteriorRSS').addEventListener('click', function () {
        navegarRss(-1);
    });

    // Manejar el evento de navegar al siguiente RSS
    document.getElementById('siguienteRSS').addEventListener('click', function () {
        navegarRss(1);
    });



});

function loadRssList() {
    // Obtener la lista de RSS desde localStorage
    var rssList = JSON.parse(localStorage.getItem('rssList')) || [];

    // Obtener el elemento select de la interfaz de usuario
    var select = document.getElementById('campoSelect');

    // Limpiar las opciones existentes en el select
    select.innerHTML = '';

    // Añadir cada RSS como una opción en el select
    rssList.forEach(function(rss) {
        var option = document.createElement('option');
        option.text = rss.title;
        option.value = rss.title;
        select.add(option);
    });

    // Si hay RSS en la lista, mostrar el contenido del primero
    if (rssList.length > 0) {
        select.selectedIndex = 0;
        showRssContent(rssList[0].title);
    }
}


function navegarRss(direccion) {
    var select = document.getElementById('campoSelect');
    var currentIndex = select.selectedIndex;
    var newIndex = currentIndex + direccion;

    // Verificar los límites y actualizar el índice
    if (newIndex >= 0 && newIndex < select.options.length) {
        select.selectedIndex = newIndex;
        showRssContent(select.options[newIndex].value);
    } else {
        alert('No hay más entradas para mostrar.');
    }
}

function addRss(title, url) {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            var response = JSON.parse(xhr.responseText);

            // Almacenar en localStorage
            storeRssInLocalStorage(title, url, response.content);

            // Actualizar la lista de RSS en la interfaz de usuario
            updateRssList(title, response.content);

            // Seleccionar automáticamente la nueva entrada en el select
            var select = document.getElementById('campoSelect');
            select.value = title;
            showRssContent(title);
        } else if (xhr.readyState === 4) {
            alert('Error al obtener el RSS desde el servidor.');
        }
    };

    xhr.open('GET', 'server.php?url=' + encodeURIComponent(url), true);
    xhr.send();
}


function storeRssInLocalStorage(title, url, content) {
    // Obtener la lista actual de RSS desde localStorage
    var rssList = JSON.parse(localStorage.getItem('rssList')) || [];

    // Verificar si el RSS ya existe y actualizarlo, o añadir uno nuevo
    var existingRssIndex = rssList.findIndex(rss => rss.title === title);
    if (existingRssIndex !== -1) {
        rssList[existingRssIndex] = { title, url, content };
    } else {
        rssList.push({ title, url, content });
    }

    // Guardar la lista actualizada en localStorage
    localStorage.setItem('rssList', JSON.stringify(rssList));
}

function updateRssList(title, content) {
    // Actualizar la interfaz de usuario
    var select = document.getElementById('campoSelect');
    var option = document.createElement('option');
    option.text = title;
    option.value = title;
    select.add(option);

    // Mostrar el contenido del nuevo RSS
    showRssContent(title);
}

function showRssContent(rssTitle) {
    // Obtener la lista de RSS desde localStorage
    var rssList = JSON.parse(localStorage.getItem('rssList')) || [];
    
    // Encontrar el RSS con el título dado
    var rss = rssList.find(function(item) {
        return item.title === rssTitle;
    });

    if (rss && rss.content) {
        // Mostrar el contenido del RSS en la interfaz de usuario
        document.getElementById('noticias').innerHTML = rss.content;
        document.getElementById('noticias').setAttribute('data-current-rss', rssTitle);
    } else {
        // Manejar el caso en que no se encuentre el contenido o el RSS
        document.getElementById('noticias').innerHTML = 'Contenido no disponible.';
        document.getElementById('noticias').removeAttribute('data-current-rss');
    }
}

function deleteRss(rssTitle) {
    // Obtener la lista actual de RSS desde localStorage
    var rssList = JSON.parse(localStorage.getItem('rssList')) || [];

    // Filtrar la lista para eliminar el RSS seleccionado
    rssList = rssList.filter(function(rss) {
        return rss.title !== rssTitle;
    });

    // Guardar la lista actualizada en localStorage
    localStorage.setItem('rssList', JSON.stringify(rssList));

    // Actualizar la interfaz de usuario
    updateUIAfterRssDeletion(rssTitle);

    // Mostrar la primera entrada de la lista, si existe
    if (rssList.length > 0) {
        var select = document.getElementById('campoSelect');
        select.selectedIndex = 0;
        showRssContent(rssList[0].title);
    } else {
        document.getElementById('noticias').innerHTML = 'No hay entradas para mostrar.';
    }
}

function updateUIAfterRssDeletion(rssTitle) {
    // Eliminar la opción del select
    var select = document.getElementById('campoSelect');
    for (var i = 0; i < select.options.length; i++) {
        if (select.options[i].value === rssTitle) {
            select.remove(i);
            break;
        }
    }

    // Si el RSS eliminado estaba siendo mostrado, limpiar el contenido
    var displayedRssTitle = document.getElementById('noticias').getAttribute('data-current-rss');
    if (displayedRssTitle === rssTitle) {
        document.getElementById('noticias').innerHTML = '';
        document.getElementById('noticias').removeAttribute('data-current-rss');
    }
}
