package br.com.stoom.store.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTOResponse {

    @NotEmpty
    @JsonProperty("id")
    private Long id;

    @NotEmpty
    @JsonProperty("description")
    private String description;

    @NotEmpty
    @JsonProperty("categoryId")
    private Long categoryId;

    @NotEmpty
    @JsonProperty("brandId")
    private Long brandId;

    @NotEmpty
    @JsonProperty("price")
    private BigDecimal price;

    public @NotEmpty Long getId() {
        return id;
    }

    public void setId(@NotEmpty Long id) {
        this.id = id;
    }

    public @NotEmpty String getDescription() {
        return description;
    }

    public void setDescription(@NotEmpty String description) {
        this.description = description;
    }

    public @NotEmpty Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@NotEmpty Long categoryId) {
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
}
