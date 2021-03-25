

function regisrerPerson(){


    const Kunde = {
        navn : navn,
        adresse : adresse
    }

    const url = "/lagre";

    $.post(url, kunde, function(resultat){
       hentAlle();
    })

}

function hentAlle(){
$.get("/hentalle",function(data){
    forlokke(data);
});
}

function forlokke(data){

    let ut = "<table class='table table-striped'>" +
        "<tr>" +
        "<th>Navn</th><th>Adresse</th>" +
        "</tr>";

    for(let i of kunder ){
        ut+="<tr><td>"+kunder[i].navn+"</td><td>"+kunder[i].adresse+"</td></tr>"
    }
    $("#ut").html(ut);
}

function slettRegister(){
$.get("/slett",function(data){
    hentAlle();
});
}