const toggleThemeButton = document.createElement('span');
toggleThemeButton.classList.add('theme-toggle');
toggleThemeButton.innerHTML = 'Modo oscuro';
toggleThemeButton.addEventListener('click', toggleDarkTheme);
document.querySelector('header nav').appendChild(toggleThemeButton);

function toggleDarkTheme() { //Para el tema oscuro
    document.body.classList.toggle('dark-theme');
    toggleThemeButton.innerHTML =
        document.body.classList.contains('dark-theme') ? 'Modo claro' : 'Modo oscuro';
}

// Mostrar las 10 criptomonedas principales
const topCryptosIds = [
    'bitcoin',
    'ethereum',
    'binancecoin',
    'cardano',
    'solana',
    'ripple',
    'polkadot',
    'dogecoin',
    'avalanche-2',
    'chainlink'
];

async function fetchCryptoPrices() {
    const response = await fetch(
        `https://api.coingecko.com/api/v3/simple/price?ids=${topCryptosIds.join(',')}&vs_currencies=usd`
    );
    const data = await response.json();
    return data;
}
async function displayTopCryptos() {
    const cryptoPrices = await fetchCryptoPrices();
    
    if (!document.querySelector('.crypto-grid')) {
        const cryptoGrid = document.createElement('div');
        cryptoGrid.classList.add('crypto-grid');

        topCryptosIds.forEach((cryptoId, index) => {
            const cryptoCard = document.createElement('div');
            cryptoCard.classList.add('crypto-card');
            cryptoCard.id = `crypto-${index}`;
            
            const cryptoName = document.createElement('h4');
            cryptoName.classList.add('crypto-name');
            cryptoName.textContent = `${cryptoId.charAt(0).toUpperCase() + cryptoId.slice(1)}`;
            cryptoCard.appendChild(cryptoName);
            
            const cryptoPrice = document.createElement('p');
            cryptoPrice.classList.add('crypto-price');
            cryptoPrice.textContent = `$${cryptoPrices[cryptoId].usd}`;
            cryptoCard.appendChild(cryptoPrice);
            
            cryptoGrid.appendChild(cryptoCard);
        });

        const contentSection = document.querySelector('.content');
        contentSection.innerHTML = '<h3>Top 10 Criptomonedas:</h3>';
        contentSection.appendChild(cryptoGrid);
    } else {
        topCryptosIds.forEach((cryptoId, index) => {
            const cryptoCard = document.getElementById(`crypto-${index}`);
            const cryptoPrice = cryptoCard.querySelector('.crypto-price');
            cryptoPrice.textContent = `$${cryptoPrices[cryptoId].usd}`;
        });
    }
}

displayTopCryptos();
setInterval(displayTopCryptos, 120000); // Actualizar precios cada dos minutos