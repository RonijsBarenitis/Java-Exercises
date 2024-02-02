package repoproglanguages.Springrepositories2.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import repoproglanguages.Springrepositories2.entities.ProgrammingLanguage;

@RepositoryRestResource
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
