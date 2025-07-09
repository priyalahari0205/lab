@RestController
@RequestMapping("/employees")
public class EmployeeController {
  @GetMapping
  public String list() {
    return "All Employees";
  }
}
