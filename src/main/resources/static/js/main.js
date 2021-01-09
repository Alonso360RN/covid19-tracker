(function() {
	const btnSearch = document.getElementById('btnSearch');
	const inputCountry = document.getElementById('inputCountry');

	const spinner = document.getElementById('spinner');
	const statsSection = document.getElementById('statsSection');
	
	const spanCountry = document.getElementById('spanCountry');
	const spanLastUpdate = document.getElementById('spanLastUpdate');
	const spanTotal = document.getElementById('spanTotal');
	const spanActive = document.getElementById('spanActive');
	const spanRecovered = document.getElementById('spanRecovered');
	const spanDeceased = document.getElementById('spanDeceased');
	
	btnSearch.addEventListener('click', (e) => {
		const country = inputCountry.value;
		
		if (country.length > 0) {
			statsSection.classList.add('visually-hidden');
			spinner.classList.remove('visually-hidden');
			
			fetch(`/covid19-tracker/api/countries/${country}`, {
				method: 'GET',
				headers: {
					'Content-Type': 'application/json'
				}
			})
			.then(response => {
				if (!response.ok) {
					throw new Error();
				}
				return response.json();
			})
			.then(json => {
				const { cases, deaths, active, recovered, country, lastUpdated } = json;
				
				spanCountry.innerText = country;
				spanLastUpdate.innerText = new Date(lastUpdated);
				
				spanTotal.innerText = Number(cases).toLocaleString('en');
				spanActive.innerText = Number(active).toLocaleString('en');
				spanRecovered.innerText = Number(recovered).toLocaleString('en');
				spanDeceased.innerText = Number(deaths).toLocaleString('en');
				
				statsSection.classList.remove('visually-hidden');
				spinner.classList.add('visually-hidden');
			})
			.catch(err => {
				spinner.classList.add('visually-hidden');
			});
		}
	});
})();