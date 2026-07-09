
        const productList = document.getElementById('productList');
        const searchInput = document.getElementById('searchInput');
        const searchBtn = document.getElementById('searchBtn');
        const allBtn = document.getElementById('allBtn');
        const message = document.getElementById('message');
        const count = document.getElementById('count');

      



        function a1(products) {
            productList.innerHTML = '';
            if (!products || products.length === 0) {
                message.innerHTML = '<p class="error">검색 결과가 없습니다.</p>';
                count.innerText = '';
                return;
            }



           
            count.innerText = `총 ${products.length}개의 상품이 검색되었습니다.`;
             products.forEach(p => {

           
                const stockStatus = p.stock < 10 ?
                    `<span class="stock-low">재고 부족 (${p.stock})</span>` :
                    `<span class="stock-normal">재고 정상 (${p.stock})</span>`;
               





                const card = document.createElement('div');
                card.className = 'product-card';
                card.innerHTML = `
                    <img src="${p.thumbnail}" alt="${p.title}">
                    <h3>${p.title}</h3>
                    <p>카테고리: ${p.category}</p>
                    <p>가격: $${p.price}</p>
                    <p>할인율: ${p.discountPercentage}%</p>
                    <p>평점: ${p.rating}</p>
                    <p>${stockStatus}</p>`;

                productList.appendChild(card);
            });
        }

    
        async function fetchProducts(url) {
            try {
                const res = await fetch(url);
                const data = await res.json();
               a1(data.products);
            } catch (err) {
                message.innerHTML = '<p class="error">데이터를 불러오는 중 오류가 발생했습니다.</p>';
            }
        }

   
        searchBtn.addEventListener('click', () => {
            const query = searchInput.value.trim();
            const specialChars = /[^a-zA-Z0-9 ]/;

         
            if (!query) {
                message.innerHTML = '<p class="error">검색어를 입력하세요.</p>';
            } else if (query.length < 2) {
                message.innerHTML = '<p class="error">검색어는 2글자 이상 입력하세요.</p>';
            } else if (specialChars.test(query)) {
                message.innerHTML = '<p class="error">검색어에는 특수문자를 입력할 수 없습니다.</p>';
            } else {
                message.innerHTML = '';
              
                fetchProducts(`https://dummyjson.com/products/search?q=${query}`);
            }
        });

       
        allBtn.addEventListener('click', () => {
            searchInput.value = '';
            message.innerHTML = '';
           
            fetchProducts('https://dummyjson.com/products?limit=30');
        });

       
        fetchProducts('https://dummyjson.com/products?limit=30');
 