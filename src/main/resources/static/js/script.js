$("#cepCodigo").keyup(function(){
	let codigoSemMascara = this.value.replace(/[^0-9]/g,'');
	if(codigoSemMascara.length == 8){
		$("#btnConsultar").removeAttr("disabled"); 
	}else{
		$("#btnConsultar").attr("disabled", "disabled"); 
	}
});