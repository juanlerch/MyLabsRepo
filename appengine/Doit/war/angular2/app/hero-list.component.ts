@Component({
  selector:    'hero-list',
  templateUrl: 'app/hero-list.component.html',
  directives:  [HeroDetailComponent],
  providers:   [HeroService]
})
export class HeroListComponent implements OnInit {
  constructor(private service: HeroService) { }
  heroes: Hero[];
  selectedHero: Hero;
  ngOnInit() {
    this.heroes = this.service.getHeroes();
  }
  selectHero(hero: Hero) { this.selectedHero = hero; }
}
