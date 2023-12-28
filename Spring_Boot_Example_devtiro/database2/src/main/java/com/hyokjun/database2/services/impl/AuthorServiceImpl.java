package com.hyokjun.database2.services.impl;

import com.hyokjun.database2.domain.entities.AuthorEntity;
import com.hyokjun.database2.repositories.AuthorRepository;
import com.hyokjun.database2.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorRepository);
    }
}
