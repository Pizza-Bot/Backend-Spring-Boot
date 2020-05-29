package com.example.Temporary.service_impl;

import com.example.Temporary.dto.SizesDTO;
import com.example.Temporary.models.Sizes;

import java.util.List;

public interface ISize {

    Sizes createSize(SizesDTO sizesDTO);

    Sizes updateSize(Sizes sizes);

    String deleteSize(Long id);

    Sizes getOne(Long id);

    List<Sizes> getAll();

}
