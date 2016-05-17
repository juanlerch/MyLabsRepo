"use strict";
var HeroService = (function () {
    function HeroService(backend, logger) {
        this.backend = backend;
        this.logger = logger;
        this.heroes = [];
    }
    HeroService.prototype.getHeroes = function () {
        var _this = this;
        this.backend.getAll(Hero).then(function (heroes) {
            _this.logger.log("Fetched " + heroes.length + " heroes.");
            (_a = _this.heroes).push.apply(_a, heroes); // fill cache
            var _a;
        });
        return this.heroes;
    };
    return HeroService;
}());
exports.HeroService = HeroService;
//# sourceMappingURL=hero.service.js.map