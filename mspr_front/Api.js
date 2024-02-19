const uriBase = "http://localhost:8080/"

const getUtilisateurs = async() =>{
    return fetch(uriBase+"utilisateurs",{
        method: 'GET',
        headers: {
            'Access-Control-Allow-Origin': 'http://localhost:8081'
        }
    }).then((res) => {
        console.log(res.json())
        return res.json()
    })
}

export {getUtilisateurs}