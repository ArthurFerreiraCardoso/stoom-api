package br.com.stoom.store.Validator;

import br.com.stoom.store.exception.NotFoundException;
import br.com.stoom.store.model.Brand;
import br.com.stoom.store.model.Category;
import br.com.stoom.store.repository.BrandRepository;
import br.com.stoom.store.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component
public class ValidateBrand {

    @Autowired
    private BrandRepository brandRepo;
    @Autowired
    private CategoryRepository categoryRepo;


    public Brand validateBrand(Long brandId) {
        Brand brand = new Brand();
        try {
            if (Objects.isNull(brandId) || brandId == 0) {
                return brandRepo.save(brand);
            } else {
                Optional<Brand> optionalBrand = brandRepo.findById(brandId);
                if (optionalBrand.isPresent()) {
                    return optionalBrand.get();
                } else {
                    throw new NotFoundException("Brand not found with id: " + brandId);
                }
            }
        } catch (Exception e) {
            throw new NotFoundException("Error validating brand: " + e.getMessage(), e);
        }
    }


    public Category validateCategory(Long categoryId) {
        Category category = new Category();
        try {
            if (Objects.isNull(categoryId) || categoryId == 0) {
                return categoryRepo.save(category);
            } else {
                Optional<Category> optionalCategory = categoryRepo.findById(categoryId);
                if (optionalCategory.isPresent()) {
                    return optionalCategory.get();
                } else {
                    throw new NotFoundException("Brand not found with id: " + categoryId);
                }
            }
        } catch (Exception e) {
            throw new NotFoundException("Error validating category: " + e.getMessage(), e);
        }
    }

}

