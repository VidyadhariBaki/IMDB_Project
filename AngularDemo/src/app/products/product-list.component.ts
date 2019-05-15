import {Component, OnInit} from '@angular/core' ;
import { Iproduct } from './product';
import { ProductService } from './product.service';

@Component({
    selector: 'pm-products' ,
    templateUrl:'./product-list.component.html',
    styleUrls:['./product-list.component.css']
})
export class ProductListComponent implements OnInit

{
    pageTitle:string = 'Product List';
    imageWidth:number=50;
    imageMargin:number=2;
    showImage:boolean=false;
    errorMessage:string;
    /* listFilter:string='cart'; */
  _listFilter:string;
  get listFilter():string{
    return this._listFilter;
  }
  set listFilter(value:string)
  {
    this._listFilter=value;
    this.filteredProducts=this.listFilter ? this.performFilter(this.listFilter) : this.products;
  }
    filteredProducts:Iproduct[];
    products : Iproduct[] =[];

  constructor(private ProductService: ProductService)
  {
    //this.filteredProducts=this.products;
   // this.listFilter= 'cart' ;
  }

  onRatingClicked(message:string) :void
  {
    this.pageTitle ='Product List:' +message;
  }
  performFilter(filterBy: string): Iproduct[]
  {
    filterBy = filterBy.toLocaleLowerCase();
    return this.products.filter((product1:Iproduct) =>
    product1.productName.toLocaleLowerCase().indexOf(filterBy) !==-1);
  }
  toggleImage() :void{
        this.showImage=!this.showImage;
    }
    ngOnInit():void{
    //  console.log('In OnInit');
    this.ProductService.getProducts().subscribe(
      products =>
      [
        this.products=products,
        this.filteredProducts=this.products
      ],
      error=>this.errorMessage=<any> error
    );
   
    }
    
}