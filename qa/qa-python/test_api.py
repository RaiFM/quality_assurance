import requests

def test_api_users():
    response = requests.get("https://reqres.in/api/users/2")

    assert response.status_code == 200
    assert response.json()["data"]["id"] == 2
