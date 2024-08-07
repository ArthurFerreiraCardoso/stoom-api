package br.com.stoom.store.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandDTORequest {

    @NotEmpty
    @JsonProperty("id")
    private Long id;
    @NotEmpty
    @JsonProperty("name")
    private String name;
    @NotEmpty
    @JsonProperty("active")
    private Boolean active;

    public @NotEmpty Long getId() {
        return id;
    }

    public void setId(@NotEmpty Long id) {
        this.id = id;
    }

    public @NotEmpty String getName() {
        return name;
    }

    public void setName(@NotEmpty String name) {
        this.name = name;
    }

    public @NotEmpty Boolean getActive() {
        return active;
    }

    public void setActive(@NotEmpty Boolean active) {
        this.active = active;
    }
}
