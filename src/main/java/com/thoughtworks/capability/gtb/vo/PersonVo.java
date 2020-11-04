package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

  private String id;
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  private Integer age;
  private String name;
  @JsonInclude(value= JsonInclude.Include.NON_NULL)
  private String hobby;
}
