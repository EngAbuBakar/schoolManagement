package DemoSpringBoot.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Department extends JpaRepository<Department,Long> {
}
