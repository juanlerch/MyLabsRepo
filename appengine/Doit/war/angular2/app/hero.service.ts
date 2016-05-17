export class HeroService {
  constructor(
    private backend: BackendService,
    private logger: Logger) { }

  private heroes: Hero[] = [];

  getHeroes() {
    this.backend.getAll(Hero).then( (heroes: Hero[]) => {
      this.logger.log(`Fetched ${heroes.length} heroes.`);
      this.heroes.push(...heroes); // fill cache
    });
    return this.heroes;
  }
}
