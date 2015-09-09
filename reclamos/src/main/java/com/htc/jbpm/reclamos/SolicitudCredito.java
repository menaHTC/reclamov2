package com.htc.jbpm.reclamos;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SolicitudCredito implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Encargado")
   private java.lang.String nombreSuperior;
   @org.kie.api.definition.type.Label("Credito a favor de")
   private java.lang.String solicitanteCredito;
   @org.kie.api.definition.type.Label("numero de cuenta")
   private java.lang.String numeroCuenta;
   @org.kie.api.definition.type.Label("Monto ")
   private java.math.BigDecimal monto;
   @org.kie.api.definition.type.Label("Por concepto de:")
   private java.lang.String concepto;

   private java.lang.String cobroAplicado;

   private java.lang.String reclamoGestionado;

   public SolicitudCredito()
   {
   }

   public java.lang.String getNombreSuperior()
   {
      return this.nombreSuperior;
   }

   public void setNombreSuperior(java.lang.String nombreSuperior)
   {
      this.nombreSuperior = nombreSuperior;
   }

   public java.lang.String getSolicitanteCredito()
   {
      return this.solicitanteCredito;
   }

   public void setSolicitanteCredito(java.lang.String solicitanteCredito)
   {
      this.solicitanteCredito = solicitanteCredito;
   }

   public java.lang.String getNumeroCuenta()
   {
      return this.numeroCuenta;
   }

   public void setNumeroCuenta(java.lang.String numeroCuenta)
   {
      this.numeroCuenta = numeroCuenta;
   }

   public java.math.BigDecimal getMonto()
   {
      return this.monto;
   }

   public void setMonto(java.math.BigDecimal monto)
   {
      this.monto = monto;
   }

   public java.lang.String getConcepto()
   {
      return this.concepto;
   }

   public void setConcepto(java.lang.String concepto)
   {
      this.concepto = concepto;
   }

   public java.lang.String getCobroAplicado()
   {
      return this.cobroAplicado;
   }

   public void setCobroAplicado(java.lang.String cobroAplicado)
   {
      this.cobroAplicado = cobroAplicado;
   }

   public java.lang.String getReclamoGestionado()
   {
      return this.reclamoGestionado;
   }

   public void setReclamoGestionado(java.lang.String reclamoGestionado)
   {
      this.reclamoGestionado = reclamoGestionado;
   }

   public SolicitudCredito(java.lang.String nombreSuperior,
         java.lang.String solicitanteCredito, java.lang.String numeroCuenta,
         java.math.BigDecimal monto, java.lang.String concepto,
         java.lang.String cobroAplicado, java.lang.String reclamoGestionado)
   {
      this.nombreSuperior = nombreSuperior;
      this.solicitanteCredito = solicitanteCredito;
      this.numeroCuenta = numeroCuenta;
      this.monto = monto;
      this.concepto = concepto;
      this.cobroAplicado = cobroAplicado;
      this.reclamoGestionado = reclamoGestionado;
   }

}