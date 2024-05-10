import axios from 'axios';

const   BASE_URL = 'https://aves.ninjas.cl/api/birds'; 

export async function fetchData() {
  try {
    const response = await axios.get(BASE_URL);
    return response.data;
  } catch (error) {
    console.error(error);
    throw error;
  }
}

