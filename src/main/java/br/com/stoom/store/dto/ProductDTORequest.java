package br.com.stoom.store.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;


public class ProductDTORequest {

    @NotEmpty
    @JsonProperty("description")
    private String description;

    @NotEmpty
    @JsonProperty("sku")
    private String sku;

    @JsonProperty("categoryId")
    private Long categoryId;

    @NotEmpty
    @JsonProperty("brandId")
    private Long brandId;

    @NotEmpty
    @JsonProperty("price")
    private BigDecimal price;

    @NotEmpty
    @JsonProperty("active")
    private Boolean active;

    public @NotEmpty String getDescription() {
        return description;
    }

    public void setDescription(@NotEmpty String description) {
        this.description = description;
    }

    public @NotEmpty String getSku() {
        return sku;
    }

    public void setSku(@NotEmpty String sku) {
        this.sku = sku;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public @NotEmpty Long getBrandId() {
        return brandId;
    }

    public void setBrandId(@NotEmpty Long brandId) {
        this.brandId = brandId;
    }

    public @NotEmpty BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@NotEmpty BigDecimal price) {
        this.price = price;
    }

    public @NotEmpty Boolean getActive() {
        return active;
    }

    public void setActive(@NotEmpty Boolean active) {
        this.active = active;
    }
}
