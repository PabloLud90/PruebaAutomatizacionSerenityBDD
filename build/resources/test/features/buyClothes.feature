@buyClothes
Feature: Test HappyPath Comprar Ropa

  Scenario Outline: Añadir 2 productos
    Given Pablo ingresar a la pagina principal
    And ingresar clothes "<user>" , "<pass>" en donde selecciono dos productos
    When visualizo el carrito de compra y doy click en checkout
    And completo el formulario de compra "<name>","<lastname>","<code>" hago click en continuar para continuar la compra
    Then hago click en finalizar compra y valido el mensaje "Thank you for your order!"

Examples:
    | user          | pass         |  name | lastname | code |
    | standard_user | secret_sauce |  Pablo | Ludenia | 10101 |
