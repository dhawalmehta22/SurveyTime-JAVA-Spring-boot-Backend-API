# Survey Time

- In memory *__H2__* database used.
- Restfull API's for Creating survey, Taking survey, Getting results of a survey.
- 

## Functionalities

- Create Survey
- Get One Survey
- Get All Survey
- Taking a survey
- Getting result of any survey 

## Links

> **All parameters are required, so apply it properly**

| No. | Name | Link | Method | Query Parameters | Body Parameters|
| 1 | Create Survey | `localhost:8080/survey/` | **POST** | **NONE** | <ul><li>`title`: title of survey</li><li>`description`: description of survey</li><li>`questions`: list of questions <ul><li>`question`: description/List of question</li></ul></li></ul> |
| 2 | Get One Survey | `localhost:8080/survey{id}` | **GET** | `id`: integer id of survey | **NONE** |
| 3 | Get All Survey | `localhost:8080/survey/` | **GET** | **NONE** | **NONE** |
| 4 | Get Result of Survey | `localhost:8080/survey{id}` | **GET** | `id`: integer id of survey | **NONE** |
