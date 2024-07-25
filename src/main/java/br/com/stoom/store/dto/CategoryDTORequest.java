package br.com.stoom.store.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTORequest {

    @NotEmpty
    @JsonProperty("id")
    private Long id;
    @NotEmpty
    @JsonProperty("description")
    private String description;
    @NotEmpty
    @JsonProperty("active")
    private Boolean active;

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

    public @NotEmpty Boolean getActive() {
        return active;
    }

    public void setActive(@NotEmpty Boolean active) {
        this.active = active;
    }
}
