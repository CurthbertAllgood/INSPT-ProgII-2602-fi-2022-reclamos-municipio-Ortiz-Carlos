<!DOCTYPE html>
<body class="body-index">
    <jsp:include page="./WEB-INF/components/header.jsp"/>
    <h1 class="titulos">Municipio Carlos Ortiz</h1>
    <p aria-hidden="true">
        <span class="placeholder col-6"></span>
    </p>

    <a href="./pages/registros.html"  class="btn btn-primary disabled placeholder col-4" aria-hidden="true"></a>
    <div class="container">
        

        <div class="col">
            
        </div>
        <div class="row align-items-start">
            <div class="card">
                <div class="card-header">
                    Servicio de autogestion
                </div>
            <div class="d-flex position-relative">
                <img src="./assets/images/visualiza-reclamos.png" class="flex-shrink-0 me-3" alt="...">
                <div>
                <h5 class="mt-0"> ¿Tenes un Reclamo?</h5>
                <p>Si necesitas generar un reclamo de inmueble, ya sea podado de arbustos, limpieza de vereda, levantamiento de escombros, 
                    alumbrado, etc. 
                    Ingresa y hacenos saber cual es tu necesidad</p>
                <a href="${pageContext.request.contextPath}/login" class="btn btn-primary">Generar Reclamo</a>
                </div>
            </div>
            <div>
                <br>
            </div>
            <div class="d-flex position-relative">
                <img src="./assets/images/atencion-al-cliente.png" class="flex-shrink-0 me-3" alt="...">
                <div>
                <h5 class="mt-0">Mira el estado de tus reclamos</h5>
                <p>Si necesitas conocer el estado del reclamo, podes verificar el mismo desde tu propia casa a través de la siguiente opcion</p>
                <a href="${pageContext.request.contextPath}/reclamos" class="btn btn-primary">Ver tus Reclamos</a>
                </div>
            
        </div>
    </div>
</div>
</div>

    <jsp:include page="./WEB-INF/components/footer.jsp"/>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>