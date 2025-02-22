package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.FornecedorRequestDTO;
import br.com.gerenciador.api.dto.FornecedorResponseDTO;
import br.com.gerenciador.api.mapper.EnderecoMapper;
import br.com.gerenciador.api.mapper.FornecedorMapper;
import br.com.gerenciador.api.model.Fornecedor;
import br.com.gerenciador.api.repository.FornecedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FornecedorServiceImpl implements FornecedorService {

    private final FornecedorRepository fornecedorRepository;
    private final FornecedorMapper fornecedorMapper;
    private final EnderecoMapper enderecoMapper;

    @Override
    public FornecedorResponseDTO criarFornecedor(FornecedorRequestDTO dto) {
        // Converte o DTO para Entidade
        Fornecedor fornecedor = fornecedorMapper.toEntity(dto);
        return fornecedorMapper.toDTO(fornecedorRepository.save(fornecedor));

    }
}
