<div class="explore-container">

	{{#parseJSON '{"title": "EXPLORE BEYOND THE CITY LIMITS", "copy" : "Make Sydney where your adventure begins. World-heritage natural wonders, world-class wine regions, and the world’s most stunning beaches are just over the horizon."}'}}
	{{> sectionintro }}
	{{/parseJSON}}

	<div class="l-h-center section-buttons">

		<!-- Select List For Mobile -->
		<div class="section-buttons-mobile">
			{{#parseJSON '{"data" : [{"option": "Attractions around Sydney"}, {"option": "Trips around Sydney"}]}'}}
			{{> dropdown }}
			{{/parseJSON}}
		</div>

		<!-- Buttons -->
		<div class="section-buttons-desktop">

			{{#parseJSON '{"label": "Attractions around Sydney", "button" : "attraction.png", "button_outline" : "attraction_outline.png", "active" : true, "extraspace" : true}'}}
			{{> button_generic}}
			{{/parseJSON}}

			{{#parseJSON '{"label": "Trips around Sydney", "button" : "trips.png", "button_outline" : "trips_outline.png", "active" : false, "extraspace" : true}'}}
			{{> button_generic}}
			{{/parseJSON}}

		</div>

	</div>

	<div class="carousel-center-container">
		<div class="carousel-owl-mobile-fill">

			<div id="carousel" class="owl-carousel owl-theme">
				<div class="carousel-item">{{> exploreitem }}</div>
				<div class="carousel-item">{{> exploreitem }}</div>
				<div class="carousel-item">{{> exploreitem }}</div>
			</div>

		</div>

	</div>

</div>