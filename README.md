How to implement productivity measure: 

We have "assignToUser"
task table has user_id which means, which user the task is assigned to
we also have "status" 
need to record when the logged-in user assigns status "Done" to a task (it will be one of theirs)
adding "completed" user_completed_tasks with int codes: 0 for incomplete, 1 for completed late, 2 for completed on time
in ViewTasks editTask: if status == 3, create entry in user_completed_tasks, with condition on time or not

have a page that shows user_completed_tasks : for all users in current team, IF current user is team lead / team creator
then do an SQL query average to get average productivity score per user, display in table column on right hand side , in percentage

need to restrict users to only one team. check if user_id and team_id combination already exist in user_team table, insert / ignore with error mssg. 
need to update table if different.
this, or need ability to remove oneself from a team. also have unique team mappings no duplicates.

