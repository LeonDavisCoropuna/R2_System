package com.project.r2system.api.commons;


import com.project.r2system.domain.budgetSystem.entities.BudgetForm;
import com.project.r2system.domain.budgetSystem.payloads.BudgetFormResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BudgetFormMapping {
    @Autowired
    private ModelMapper modelMapper;

    public BudgetFormResponse mapBudgetFormToResponse(BudgetForm budgetFrom) {

        return modelMapper.map(budgetFrom, BudgetFormResponse.class);
    }
    public BudgetForm createBudgetFormByResponse(BudgetFormResponse budgetFormResponse){

        return modelMapper.map(budgetFormResponse, BudgetForm.class);
    }
    public void updateBudgetFormByResponse(BudgetFormResponse budgetFormResponse, BudgetForm budgetForm){

        budgetForm.setIdN(budgetFormResponse.getIdN());
        budgetForm.setNroOrden(budgetFormResponse.getNroOrden());
        budgetForm.setCliente(budgetFormResponse.getCliente());
        budgetForm.setFecha(budgetFormResponse.getFecha());
        budgetForm.setAprobadoPor(budgetFormResponse.getAprobadoPor());
        budgetForm.setFechaAprobacion(budgetFormResponse.getFechaAprobacion());
        budgetForm.setFechaEntrega(budgetFormResponse.getFechaEntrega());
        budgetForm.setNroFactura(budgetFormResponse.getNroFactura());
        budgetForm.setEstado(budgetFormResponse.getEstado());
        budgetForm.setObservacion(budgetFormResponse.getObservacion());
        budgetForm.setTipoOrden(budgetFormResponse.getTipoOrden());
        budgetForm.setStatus(budgetFormResponse.getStatus());
        budgetForm.setCreado(budgetFormResponse.getCreado());
        budgetForm.setFechaActualizado(budgetForm.getFechaActualizado());
        budgetForm.setCreadoPor(budgetForm.getCreadoPor());
        budgetForm.setActualizadoPor(budgetFormResponse.getActualizadoPor());
        budgetForm.setFechaTermino(budgetFormResponse.getFechaTermino());
        budgetForm.setTerminadoPor(budgetFormResponse.getTerminadoPor());
        budgetForm.setBitacora(budgetFormResponse.getBitacora());
        budgetForm.setValidadoPor(budgetFormResponse.getValidadoPor());
    }
}
