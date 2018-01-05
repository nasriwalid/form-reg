// alert($("input[name='form-lieuN']:checked").val()); 
$(document).change(function(){
	//selection de lieu de naissance
	if ($("input[name='form-lieuN']:checked").val() == "ET"){
		$("#img-country").attr("src","assets/img/country/"+$("#form-country").val()+".png");
		$("#form-country-hide").removeAttr("hidden");
		$("#img-country").removeAttr("hidden");
		$("#form-tn-hide").attr("hidden","true");
	}
	else{
		$("#form-country-hide").attr("hidden","true");
		$("#form-tn-hide").removeAttr("hidden");
	}
	// selection d'evidence cin ou passport 
	if ($("input[name='form-evid']:checked").val() == "CIN"){
		$(".form-cin").removeAttr("hidden");
		$(".form-pp").attr("hidden","true");
	}
	else if ($("input[name='form-evid']:checked").val() == "PP"){
		$(".form-pp").removeAttr("hidden");
		$(".form-cin").attr("hidden","true");
	}
}).trigger('change');