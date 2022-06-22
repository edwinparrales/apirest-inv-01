// Call the dataTables jQuery plugin
$(document).ready(function () {
    //$('#dataTable').DataTable();
    listar();
});

async function listar() {

    const respuenta = await fetch('http://localhost:8080/api/cliente/listar', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

    });
    const lista = await respuenta.json();
    let listaConten = ""
    for (const elemento of lista) {
        let item = `
       <tr>
           <td>${elemento.id}</td>
           <td>${elemento.nombre}</td>
           <td>${elemento.documento}</td>
           <td>${elemento.ciudad}</td>
           <td>${elemento.barrio}</td>
           <td>${elemento.direccion}</td>
           <td>${elemento.telefono}</td>
           <td>${elemento.email}</td>
                                        <td>
                                            <a href="#" class="btn btn-danger btn-circle btn-sm">
                                                <i class="fas fa-trash"></i>
                                            </a>
                                        </td>
                                    </tr>
    
    `
        listaConten += item;
    }
    let tr = document.querySelector('#dataTable tbody');

    tr.innerHTML = listaConten;


}