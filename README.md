# Visualizador de inventario y detector de objetos repetidos de Rocket League
¿Tienes demasiados objetos en tu inventario de Rocket League y quieres vender los objetos que tienes duplicados pero no los encuentras porque el inventario del juego no ayuda a encontrar estos objetos? Con este programa podrás encontrarlos, además de poder filtrar su calidad y poder observar la cantidad que tienes de cada uno de estos objetos repetidos.

![image](https://github.com/Sauleteh/rocket-league-visualizador-inventario-y-repetidos/assets/22859905/759e22d1-b496-45e3-b0ea-94570dde57b3)

Para visualizar el inventario de forma normal tienes el cuadro de búsqueda inferior, escribe el nombre del objeto y se te mostrarán los objetos que coincidan con tu búsqueda, funciona igual que dentro del juego.

## Requisitos especiales
Este programa solo funciona para las plataformas de PC (Epic y Steam), siendo necesario usar BakkesMod (https://bakkesmod.com/download.php) y el plugin Better Inventory Export (https://bakkesplugins.com/plugins/view/155 [Créditos a Bakkes por la creación de este plugin]). Las instrucciones de uso son las siguientes:
1. Instala BakkesMod
2. Instala el plugin
3. Abre BakkesMod
4. Abre Rocket League
5. Abre el menú de BakkesMod con F2 dentro del juego
6. Dirígete a la pestaña *Plugins*
7. Pulsa sobre *Better Inventory Export*
8. Pulsa *Dump to CSV*

![image](https://github.com/Sauleteh/rocket-league-visualizador-inventario-y-repetidos/assets/22859905/7717b3e1-857b-414f-ad2c-eb828955549d)

El CSV exportado estará en %APPDATA%\bakkesmod\bakkesmod\data. No lo muevas de ahí, el programa busca el archivo desde esta ruta. Cada vez que quieras actualizar el CSV tan solo repite el paso 8.

## Sobre la versión BETA
La versión BETA cuenta con conexión a https://rl.insider.gg para mostrar en tiempo real los precios de los objetos de tu inventario; sin embargo, aún está en BETA y está siendo bastante difícil conseguir los precios ya que no cuento con una API que me ayude, de momento lo que hace es buscar los objetos por su nombre por lo que si tienes el Rocket League en inglés funcionará mucho mejor ya que la página no cuenta con una traducción muy buena al español. Si se te ocurre alguna forma de solventar este problema, puedes hablarme abriendo una *Issue* en Github.

![image](https://github.com/Sauleteh/rocket-league-visualizador-inventario-y-repetidos/assets/22859905/41d35c39-272d-4036-a8d1-239b76c4dfcb)
