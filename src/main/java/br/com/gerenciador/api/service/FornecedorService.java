package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.FornecedorRequestDTO;
import br.com.gerenciador.api.dto.FornecedorResponseDTO;

public interface FornecedorService {

    FornecedorResponseDTO criarFornecedor(FornecedorRequestDTO dto);
}
