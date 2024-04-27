from math import sin, cos, sqrt, atan2, radians

def distance_between_points(lat1, lon1, lat2, lon2):
    # Radius of the Earth in kilometers
    R = 6371.0

    # Convert latitude and longitude from degrees to radians
    lat1 = radians(lat1)
    lon1 = radians(lon1)
    lat2 = radians(lat2)
    lon2 = radians(lon2)

    # Difference in coordinates
    dlon = lon2 - lon1
    dlat = lat2 - lat1

    # Haversine formula
    a = sin(dlat / 2)**2 + cos(lat1) * cos(lat2) * sin(dlon / 2)**2
    c = 2 * atan2(sqrt(a), sqrt(1 - a))

    # Distance in kilometers
    distance = R * c

    return distance

# Coordinates for Florida (Orlando)
florida_lat = 28.5383
florida_lon = -81.3792

# Coordinates for the Moon (average distance from Earth)
moon_lat = 0
moon_lon = 0

# Calculate the distance
distance = distance_between_points(florida_lat, florida_lon, moon_lat, moon_lon)

print("Distance between Florida and the Moon:", round(distance, 2), "kilometers")
