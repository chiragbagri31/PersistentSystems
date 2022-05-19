// App.js
import React from "react";
import ProductList from "./ProductList";

class App extends React.Component 
{
    render() {
        return <ProductList></ProductList>;
    }
}

export default App;




// Product.js
import React from "react";

class Product extends React.Component 
{
    constructor() 
    {
        super();
    }

    render() 
    {
        if (this.props.product != undefined) 
        {
            console.log(this.props.product);
            return (
                <div>
                    <img
                        src={this.props.product.productImage}
                        alt="no Image"
                        id="prod-img"
                    ></img>
                    
                    <h3 classNAme="prod-name">{this.props.product.name}</h3>
                    <div className="prod-category">{this.props.product.category}</div>
                    <div className="prod-price">{this.props.product.price}</div>
                    <button>Add to card</button>
                </div>
            );
        } 

        else 
        {
            return null;
        }
    }
}

export default Product;




// ProductList.js
import React from "react";
import Product from "./Product";

class ProductList extends React.Component 
{
    constructor() 
    {
        super();
        this.state = 
        {
            productsList: [
            {
                id: 1,
                name: "Samsung Galaxy Note 10",
                category: "Mobiles",
                country: "Canada",
                price: 11500,
                currencyCode: "CAD",
                productImage: require("./assets/img/product1.jpg"),
            },
            {
                id: 5,
                name: "SkullCandy BT Inkd Plus",
                category: "Bluetooth Headset",
                country: "UK",
                price: 800,
                currencyCode: "USD",
                productImage: require("./assets/img/product2.jpg"),
            },
            {
                id: 13,
                name: "Anker Soundbuds Rise",
                category: "Bluetooth Headset",
                country: "Canada",
                price: 600,
                currencyCode: "CAD",
                productImage: require("./assets/img/product3.jpg"),
            },
            {
                id: 8,
                name: "JBL Flip 3 Bluetooth speaker",
                category: "Speakers",
                country: "India",
                price: 1400,
                currencyCode: "INR",
                productImage: require("./assets/img/product4.jpg"),
            },
            {
                id: 10,
                name: "Conekt Volt Power Bank",
                category: "Power Bank",
                country: "China",
                price: 650,
                currencyCode: "CNY",
                productImage: require("./assets/img/product5.jpg"),
            },
            {
                id: 18,
                name: "Apple Watch Series",
                category: "Watch",
                country: "China",
                price: 640,
                currencyCode: "CNY",
                productImage: require("./assets/img/product6.jpg"),
            },
            {
                id: 20,
                name: "IBall Slide Spirit X2",
                category: "Tablets",
                country: "India",
                price: 9000,
                currencyCode: "INR",
                productImage: require("./assets/img/product7.jpg"),
            },
            {
                id: 22,
                name: "Skullcandy Set 2.0 ",
                category: "Headset",
                country: "China",
                price: 900,
                currencyCode: "CNY",
                productImage: require("./assets/img/product8.jpg"),
            },
            ],
            dProduct: {},
        };
    }

    render() 
    {
        let displayProduct = this.state.dProduct;
        if (!displayProduct) displayProduct = undefined;
        return (
            <div>
                <h1> in Product List</h1>
                <ul className="products">
                    <li
                        id="product0"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[0].id}
                        >
                        <img
                        src={this.state.productsList[0].productImage}
                        id="image0"
                        ></img>
                        <span>{this.state.productsList[0].name}</span>
                    </li>

                    <li
                        id="product1"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[1].id}
                        >
                        <img
                        src={this.state.productsList[1].productImage}
                        id="image1"
                        ></img>
                        <span>{this.state.productsList[1].name}</span>
                    </li>

                    <li
                        id="product2"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[2].id}
                        >
                        <img
                        src={this.state.productsList[2].productImage}
                        id="image2"
                        ></img>
                        <span>{this.state.productsList[2].name}</span>
                    </li>

                    <li
                        id="product3"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[3].id}
                        >
                        <img
                        src={this.state.productsList[3].productImage}
                        id="image3"
                        ></img>
                        <span>{this.state.productsList[3].name}</span>
                    </li>

                    <li
                        id="product4"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[4].id}
                        >
                        <img
                        src={this.state.productsList[4].productImage}
                        id="image4"
                        ></img>
                        <span>{this.state.productsList[4].name}</span>
                    </li>

                    <li
                        id="product5"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[5].id}
                        >
                        <img
                        src={this.state.productsList[5].productImage}
                        id="image5"
                        ></img>
                        <span>{this.state.productsList[5].name}</span>
                    </li>

                    <li
                        id="product6"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[6].id}
                        >
                        <img
                        src={this.state.productsList[6].productImage}
                        id="image6"
                        ></img>
                        <span>{this.state.productsList[6].name}</span>
                    </li>

                    <li
                        id="product7"
                        onClick={this.handleClick.bind(this)}
                        data-key={this.state.productsList[7].id}
                        >
                        <img
                        src={this.state.productsList[7].productImage}
                        id="image7"
                        ></img>
                        <span>{this.state.productsList[7].name}</span>
                    </li>
                </ul>
                <Product product={displayProduct} />
            </div>
        );
    }

    handleClick(e) 
    {
        let product;
        for (var i = 0; i < this.state.productsList.length; i++) 
        {
            if (e.target.dataset.key == this.state.productsList[i].id)
                product = this.state.productsList[i];
        }
        this.setState({ dProduct: product });
    }
}

export default ProductList;
