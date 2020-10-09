package demo;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {

 private final Long id;

 public CustomerNotFoundException(Long id) {
  super("customer-not-found-" + id);
  this.id = id;
 }

 public Long getCustomerId() {
  return id;
 }
}
