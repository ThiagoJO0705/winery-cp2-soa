package br.com.fiap.winery;

import br.com.fiap.winery.stock.WineStockService;
import br.com.fiap.winery.stock.WineStockServiceImplementationService;
import br.com.fiap.winery.warning.WineWarningService;
import br.com.fiap.winery.warning.WineWarningServiceImplementationService;

public class ApplicationClient2 {
    public static void main(String[] args) {
        // Consome o serviço de pedidos
        WineStockServiceImplementationService stockFactory = new WineStockServiceImplementationService();
        WineStockService stockService = stockFactory.getWineStockServiceImplementationPort();

        String order = stockService.placeOrder("Pinot Noir", 2);
        System.out.println("Resposta do pedido: " + order);

        // Consome o serviço de aviso
        WineWarningServiceImplementationService warningFactory = new WineWarningServiceImplementationService();
        WineWarningService warningService = warningFactory.getWineWarningServiceImplementationPort();

        String warn = warningService.sendWarn();
        System.out.println("Aviso recebido: " + warn);
    }
}
