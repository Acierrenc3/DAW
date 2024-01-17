<?php
// Encabezado para indicar que la respuesta es JSON
header("Content-Type: application/json");

// Verifica que la URL del feed RSS se haya proporcionado
if (isset($_GET['url'])) {
    // Obtén la URL del feed RSS desde la consulta
    $rssUrl = $_GET['url'];

    // Obtén el contenido del feed RSS
    $rssContent = file_get_contents($rssUrl);

    // Convierte el contenido XML del feed a un objeto
    $rssData = simplexml_load_string($rssContent, null, LIBXML_NOCDATA);
    
    // Extrae el título y el contenido del feed
    $title = (string) $rssData->channel->title;
    $content = '<ul>';

    foreach ($rssData->channel->item as $item) {
        $content .= '<li>' . $item->title . '</li>';
    }
    $content .= '</ul>';
     
    // Devuelve el título y el contenido en formato JSON
    echo json_encode(['title' => $title, 'content' => $content]);
} else {
    // Si no se proporciona la URL, devuelve un error
    echo json_encode(['error' => 'La URL del feed RSS no se proporcionó']);
}
?>
