package com.jirademo.jiraapi.auth;

import com.jirademo.jiraapi.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {

  private String name;

  private String password;

  private String email;

  private Role role;
}
