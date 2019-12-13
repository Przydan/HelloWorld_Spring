package pl.przydan.hello.lang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LangRepository extends JpaRepository<Lang, Integer> {
//    List<Lang> findByCodeAnAndWelcomeMsg(String code, String msg);
}
