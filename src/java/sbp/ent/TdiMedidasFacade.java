/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import PaquetesBD.TdiMedidas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fairy
 */
@Stateless
public class TdiMedidasFacade extends AbstractFacade<TdiMedidas> {
    @PersistenceContext(unitName = "DipromacomSAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdiMedidasFacade() {
        super(TdiMedidas.class);
    }
    
}
