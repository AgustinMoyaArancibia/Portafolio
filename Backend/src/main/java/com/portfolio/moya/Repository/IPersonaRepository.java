
package com.portfolio.moya.Repository;
import com.portfolio.moya.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona , Long>{
    
}