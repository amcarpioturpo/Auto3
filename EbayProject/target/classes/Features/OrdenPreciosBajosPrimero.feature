Feature: Organizar los Productos en orden de Precios mas bajo primero
  Como usuario, me interesa conocer los productos de menor precio

  Scenario: organizar los precios de una lista de productos de Pokemon
    Given   Ingreso a la web ebay.com
    When    Selecciono la Categoria "Colección y Arte" y SubCategoria "Arte y Animación"
    And     Selecciono del Carrusel la categoría "Anime japonés"
    And     Selecciono del segundo Carrusel la categoría "Pokémon"
    And     Selecciono la opción PRECIO + ENVÍO: MÁS BAJO PRIMERO
    Then    Visualizo los resultados
    And     Verifico el orden de los precios