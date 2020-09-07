Feature: Ingresar a productos y servicios para validar PDf en tarjeta de credito

  Scenario: Validar PDf en tarjeta de credito
    Given que Juan quiere ingresar a productos y servicios de personas banistmo
    When busca el producto tarjetas de credito
    Then validar que al descargar el pdf del contrato fue generado exitosamente