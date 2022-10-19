
package com.portfolio.moya.Interface;

import com.portfolio.moya.Persona;
import java.util.List;



public interface IPersonaService {
    //traer lista de  persona 
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //elimar usuario por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
}
