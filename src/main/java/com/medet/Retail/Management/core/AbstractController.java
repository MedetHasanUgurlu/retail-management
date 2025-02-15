package com.medet.Retail.Management.core;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public abstract class AbstractController<T extends AbstractService>{

    private final T service;

}
