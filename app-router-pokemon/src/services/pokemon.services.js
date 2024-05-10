import axios from 'axios';

const BASE_URL = 'https://pokeapi.co/api/v2';

//Es una promesa
function listPokemons({limit, offset}){
    return axios.get(`${BASE_URL}/pokemon`, {
        params: {
            limit,
            offset
        }
    }).then(result => {return result.data});
}

function getDetails(id){
    return axios.get(`${BASE_URL}/pokemon/${id}`, 
    ).then(result => {return result.data});
}

export {listPokemons}