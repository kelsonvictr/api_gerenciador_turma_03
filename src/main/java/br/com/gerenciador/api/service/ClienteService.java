package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.ClienteRequestDTO;
import br.com.gerenciador.api.dto.ClienteResponseDTO;

public interface ClienteService {
    ClienteResponseDTO criarCliente(ClienteRequestDTO dto);
}
