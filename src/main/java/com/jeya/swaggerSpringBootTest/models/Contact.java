package com.jeya.swaggerSpringBootTest.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the contact")
public class Contact
{
  @ApiModelProperty(notes = "The unique id of the contact")
  private String id;
  @ApiModelProperty(notes = "The person's phone number")
  private String phone;
  @ApiModelProperty(notes = "The person's name")
  private String name;
  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
