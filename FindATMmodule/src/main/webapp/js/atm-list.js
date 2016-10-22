$(document).ready(function () {
    $('#list-table').DataTable({
        "ajax": {
            "url": "camel/atm",
            "dataSrc": ""
        },
        "columns": [
          { data: "address.city" },
          { data: "address.houseNumber" },
          { data: "address.street" },
          { data: "address.postalCode" },
          { data: "address.geoLocation.lat" },
          { data: "address.geoLocation.lng" },
          { data: "type" }
        ]
    });
});

$('#input-city').on('keyup', function (e) {
    if (e.keyCode === 13) {
        find();
    }
});

function find() {
    
    var url;
    var searchVal = $('#input-city').val();
    if (searchVal.length === 0)
        url = "camel/atm";
    else
        url = "camel/atm/city/" + searchVal;
    
    var table = $('#list-table').DataTable();
    table.destroy();

    $('#list-table').DataTable({
        "ajax": {
            "url": url,
            "dataSrc": ""
        },
        "columns": [
          { data: "address.city" },
          { data: "address.houseNumber" },
          { data: "address.street" },
          { data: "address.postalCode" },
          { data: "address.geoLocation.lat" },
          { data: "address.geoLocation.lng" },
          { data: "type" }
        ]
    });
}