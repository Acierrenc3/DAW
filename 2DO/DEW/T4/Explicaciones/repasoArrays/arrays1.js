subGeneroTerror = ["Terror", "Horror", "Suspense", "Thriller"];
genero = ["Aventuras", subGeneroTerror, "Accion", "Comedia"];

peli1 = ["El reino de los cielos", genero[1][2], 2006];
peli2 = ["Viernes 13", genero[1][0], 1990];
peli3 = ["Star Wars", genero[2], 1970];

listaPeliculas = [peli1, peli2, peli3];

for (let i = 0; i < listaPeliculas.length; i++) {
  console.log(i);
  console.log(listaPeliculas[i]);
}
