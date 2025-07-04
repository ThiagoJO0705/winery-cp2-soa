package br.com.fiap.winery;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WineWarningService {

    @WebMethod
    String sendWarn();
}